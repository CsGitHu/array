function ResetValues() {
    $("#AddDialog input").val('');
}

//搜索
function searchUser() {
    //datagrid控制重新加载的方法
    //$("#dg").datagrid("load",跟查询条件的参数);
    var $username=$("#name").val();
    var $code=$("#code").val();
    $("#dg").datagrid("load",{"name":$username,"code":$code})
    alert("dssfdsfdsf")
}

$(function () {
    //使用datagrid绑定数据展示
    $('#dg').datagrid({

        url: '/selectPageAll',
        fitColumns: true,
        pagination: true,
        pageList: [5, 10, 15, 20],
        toolbar: "#ToolBar",
        pageSize: 5,
        columns: [[
            {field: 'ck', checkbox: true},  //复选框列
            {field: 'id', title: '编号', width: 50, align: "center"},
            {field: 'username', title: '姓名', width: 50, align: "center"},
            {field: 'password', title: '密码', width: 50, align: "center"},
            {field: 'card', title: '身份证', width: 50, align: "center"},
            {field: 'tel', title: '手机号', width: 50, align: "center" },
            {field: 'address', title: '地址', width: 50, align: "center"},
            {field: 'code', title: '存件码', width: 50, align: "center"},
            {
                field: 'delSingle', title: '操作', width: 50, align: "center",
                formatter: function (value, row, index) {
                    //同步跳转 "<a href='?id="+row.id+"'>删除</a>"
                    return "<a href='javascript:DeleteByFruitName(" + row.id + ")'>删除</a>";
                }
            }
        ]]
    });
});


//打开添加窗口
function Add() {
    // alert("打开窗口");
    $("#AddDialog").dialog("open").dialog('setTitle', "添加区域");
}


//保存
function SaveDialog() {
    //跳转到后台实现保存
    //传统:取值-->通过$.Ajax方法发送异步请求实现添加
    $('#SaveDialogForm').form('submit', {
        url: "/saveUsers",       //提交的服务器地址
        success: function (data) { //成功的回调函数
            //data接收服务器返回值 json字符串 (不是json对象)
            var obj = $.parseJSON(data);
            if (obj.result > 0) {
                $("#AddDialog").dialog("close");  //关闭
                $.messager.alert('提示框', '恭喜添加成功!');
                $("#dg").datagrid('reload'); //刷新
            } else {
                $.messager.alert('提示框', '系统正在维护!');
            }
        }
    })
    ResetValues()
}

//关闭添加窗口
function CloseDialog() {
    $("#AddDialog").dialog("close");
}


//弹出修改对话框
function ModifyBySelect() {
    //判断有没有选择修改的记录
    //获取所有选中行，返回的数据，如果没有选中返回空
    var SelectRows = $("#dg").datagrid('getSelections');
    if (SelectRows.length != 1) {
        $.messager.alert('提示框', '你还没有选中行，或者选择了多行');
        return;
    }
    //选择了一行
    //还原数据
    var SelectRow = SelectRows[0];  //获取当前行的json:{"id":1000,"name":"丰台"}
    //打开编辑对话框
    $("#upDialog").dialog("open").dialog('setTitle', "修改区域");
    //获得行对象的数据加载到表单中显示
    //注意:SelectRow表示的就是当前行的Json:{"id":1000,"name":"丰台"}
    // 表单对象名称与json对象的键相同即可还原
    $("#upDialogForm").form('load', SelectRow);

}

function updateDialog() {
    //跳转到后台实现保存
    //传统:取值-->通过$.Ajax方法发送异步请求实现添加
    $('#upDialogForm').form('submit', {
        url: "/updateUsers",       //提交的服务器地址
        success: function (data) { //成功的回调函数
            //data接收服务器返回值 json字符串 (不是json对象)
            var obj = $.parseJSON(data);
            if (obj.result > 0) {
                $("#upDialog").dialog("close");  //关闭
                $.messager.alert('提示框', '恭喜修改成功!');
                $("#dg").datagrid('reload'); //刷新
            } else {
                $.messager.alert('提示框', '系统正在维护!');
            }
        }
    })
}

//关闭修改
function CloseupDialog() {
    $("#upDialog").dialog("close");
}

// //删除单个区域
// function delSingle(id) {
//     $.messager.confirm('确认提示框', '删除我就没意思了!', function (result) {
//         if (result) {
//             // 实现删除  发送异步请求实现删除
//             //alert(id);
//             //$.post("服务器地址",给服务器传参,回调函数,"json");
//             //传参的格式: {"参数名称":值,"参数名称":值}
//
//             $.post("/deleteUsers", {"id": id}, function (data) {
//
//                 if (data.result > 0) {
//                     $("#dg").datagrid('reload'); //刷新
//                     $.messager.alert('提示框', '删除成功!');
//                 } else {
//                     $.messager.alert('提示框', '系统正在维护!');
//                 }
//             }, "json")
//         }
//     })
// }

//删除的代码
function DeleteByFruitName() {
    //获取选择行
    var SelectRows = $("#dg").datagrid('getSelections');
   // alert("ddd" + SelectRows.length);
    if (0 == SelectRows.length) {
        $.messager.alert("系统提示", "请选择要删除的数据");
        return;
    }
    var SelectIndexArr = [];
    for (var i = 0; i < SelectRows.length; i++) {
        SelectIndexArr.push(SelectRows[i].id);
    }
    var SelectIndexToString = SelectIndexArr.join(",");
    $.messager.confirm("系统提示", "你确定要删除<font color=red> " + SelectRows.length + " </font>条数据吗?", function (xo) {
        if (xo) {
            $("#dg").datagrid('reload');
            //支持多项删除
            //alert(SelectIndexToString);
            $.post("/deleteUsers", {"ids": SelectIndexToString}, function (data) {
                if (data.result >= 1) {
                    $.messager.alert("系统提示", "你已成功删除 <font color=green> " + data.result + " </font>条数据!~");
                    $("#dg").datagrid('reload');//刷新
                }
                else {
                    $.messager.alert("系统提示", "<font color=red>删除失败</font>");
                }
            }, "json");
        }
    });
}

