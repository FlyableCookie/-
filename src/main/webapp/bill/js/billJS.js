$(document).ready(function () {
    var path = $("#ContextPath").val();
    getAll();

    $("#byStatus").click(function () {
        var data;
        if ($("#byStatus").text() === "未缴费账单") {
            data = JSON.parse('{"integer":0}');
        } else {
            data = JSON.parse('{"integer":1}');
        }
        $.ajax({
            type:"POST",
            url:path + "/GetBillAction_getBillByStatus",
            datatype:"json",
            data:data,
            success:function (back) {
                $("#tbody").html(getListHtml(back));
                if ($("#byStatus").text() === "未缴费账单"){
                    $("#byStatus").text("已缴费账单");
                } else {
                    $("#byStatus").text("未缴费账单");
                }
            }
        })
    });

    $("#all").click(function () {
        getAll();
    });

    $("#save").click(function () {
        var id = $("#save_residentId").val();
        var type = $("#save_billType").val();
        var money = $("#save_billMoney").val();

        if (!(/^[0-9]*$/.test(id))){
            alert("请输入正确的居民编号");
            return;
        }
        if (!(/^[0-9]*.[0-9]*$/).test(money)){
            alert("请输入正确的金额");
            return;
        }


        var str = '{"billEntity.residentsEntity.residentId":'+id+',' +
            '"billEntity.billType":"'+type+'",' +
            '"billEntity.billMoney":'+money+'}';
        var json = JSON.parse(str);

        $.ajax({
            type:"POST",
            url:path + "/BillAction_saveBill",
            datatype:"json",
            data:json,
            success:function (back) {
                console.log(back);
                if (back == "success"){
                    $("#all").click();
                } else {
                    alert("该居民不存在");
                }

            }
        })
    });


    

    function getAll() {
        $.ajax({
            type:"POST",
            url:path + "/GetBillAction_getBillList",
            success:function (back) {
                $("#tbody").html(getListHtml(back));
            }
        })
    }
    
    function getListHtml(json) {
        var html = "";
        for (var i = 0; i<json.length; i++){
            html += "<tr id='tr"+json[i].billId+"'>";
            html += "<td>"+json[i].billTime.substr(0, 10)+"</td>";
            html += "<td>"+json[i].residentsEntity.residentName+"</td>";
            html += "<td>"+json[i].billType+"</td>";
            html += "<td>￥"+json[i].billMoney+"</td>";
            if (json[i].billStatus == 0){
                html += "<td id='status"+json[i].billId+"'>未缴费</td>";
            } else {
                html += "<td id='status"+json[i].billId+"'>已缴费</td>";
            }
            html += "<td>";
            html += "<a class=\"text-danger\" href='#'" +
                " onclick=\"return deleteBillByID("+json[i].billId+");\">删除</a>";
            html += "<span>|</span>";
            if (json[i].billStatus == 0){
                html += "<a id='operation"+json[i].billId+"' class='text-primary'" +
                    " href='#' onclick='updateBill("+json[i].billId+")'>缴费</a>"
            } else {
                html += "<a id='operation"+json[i].billId+"' class='text-dark' href='#'>缴费</a>"
            }
            html += "</tr>";
        }
        return html;
    }
});

function deleteBillByID(id) {
    var data = JSON.parse('{"Integer":'+id+'}');
    var path =  $("#ContextPath").val();
    $.ajax({
        type:"POST",
        url:path + "/BillAction_deleteBill",
        datatype:"json",
        data:data,
        success:function (back) {
            console.log("Well Done!");
            $("#tr"+id).html("");
        },
        error:function (back) {
            console.log("error");
        }
    });
}

function updateBill(id) {
    var path =  $("#ContextPath").val();
    var str = '{"billEntity.billId":'+id+'}';
    var json = JSON.parse(str);
    $.ajax({
        type:"POST",
        url:path + "/BillAction_updateBill",
        datatype:"json",
        data:json,
        success:function (back) {
            $("#status"+id).text("已缴费");
            $("#operation"+id).toggleClass("text-dark");
        }
    })
}