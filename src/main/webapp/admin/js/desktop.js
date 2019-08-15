
$(function(){
    //使用datagrid绑定数据展示
    $('#dg').datagrid({
        title:"未审核管理",
        url:'/getDesktopByNoState',
        fitColumns: true,
        pagination: true,
        pageList: [5, 10, 15, 20],
        toolbar:"#ToolBar",
        pageSize:5,
        columns: [[
            {field:'ck',checkbox:true},  //复选框列
            { field: 'id', title: '编号', width: 50, align: "center" },
            { field: 'susername', title: '姓名', width: 50, align: "center" },
            { field: 'scard', title: '身份证', width: 50, align: "center" },
            { field: 'scord', title: '存件码', width: 50, align: "center" },
            { field: 'ispass', title: '状态', width: 50, align: "center" ,
                formatter:function(value,row,index){
                    return "未审核";
                }
            },
            { field: 'opt', title: '操作', width: 50, align: "center",
                formatter: function(value,row,index){
                    return "<a href='javascript:checkPass("+row.id+")'>审核</a>";
                }
            }
        ]]
    });
});


//审核通过的方法
function checkPass(id) {
    //发布异步请求
    $.post("/passDesktop", {"id": id}, function (data) {
        if (data.result > 0) {
            $.messager.alert('提示框', '恭喜通过成功!');
            $("#dg").datagrid("reload");
        } else {
            $.messager.alert('提示框', '审核失败!');
        }
    }, "json");
}


