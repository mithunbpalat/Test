
getCourse();

function getCourse(){
    $.ajax({
        type      : 'GET',
        url       : 'http://localhost:8083/exam/getallcourse',
        success   : function(result){
            console.log(result);
            getCourseSuccess(result);
        }
    });
}


function getCourseSuccess(response){

    $(".exambody").empty();
    var row = '';
    var tr = '';
    $.each(response, function(key,inv){
        tr = '<tr>'+
              '<td>'+inv.cid +'</td>'+
              '<td>'+inv.course +'</td>'+
              '<td>'+inv.fees +'</td>'+
              '<td>'+inv.duration +'</td>'+
              '</tr>'
        row = row + tr ;
    })
    $(".exambody").append(row);
}

$(".searchsinglecourse").on('click',function(){
    getCourseSingle();
})


function getCourseSingle(){
    var cid = $("#usr").val();
    $.ajax({
        type      : 'GET',
        url       : 'http://localhost:8083/exam/getcourse?cid='+cid,
        success   : function(result){
            console.log(result);
            getCourseSingleSuccess(result);
        }
    });
}


function getCourseSingleSuccess(response){

    $(".cid").val(response.cid);
    $(".course").val(response.course);
    $(".fees").val(response.fees);
    $(".duration").val(response.duration);

}


$(".deletesinglecourse").on('click',function(){
    deleteCourseSingle();
})


function deleteCourseSingle(){
    var cid = $("#usr").val();
    $.ajax({
        type      : 'DELETE',
        url       : 'http://localhost:8083/exam/deletecourse?cid='+cid,
        success   : function(result){
            console.log(result);
            $(".msg").show();
            $(".msg").delay("slow").fadeIn();
        }
    });
}


$(".updatesinglecourse").on('click',function(){
    updatesinglecourse();
})

function updatesinglecourse(){
    var course = {
        cid       :  $(".cid").val(),
        course    :  $(".course").val(),
        fees      :  $(".fees").val(),
        duration  :  $(".duration").val()
    } 

    $.ajax({
        type          : 'POST',
        url           : 'http://localhost:8083/exam/updatecourse',
        data          : JSON.stringify(course),
        datatype      : "json",
        contentType   : 'application/json;charset = utf-8',
        success   : function(result){
            console.log(result);
            getCourseSuccess(result);
        }
    });
}


$(".savesinglecourse").on('click',function(){
    savesinglecourse();
})

function savesinglecourse(){
    var course = {
        course    :  $(".course").val(),
        fees      :  $(".fees").val(),
        duration  :  $(".duration").val()
    } 

    $.ajax({
        type          : 'POST',
        url           : 'http://localhost:8083/exam/savecourse',
        data          : JSON.stringify(course),
        datatype      : "json",
        contentType   : 'application/json;charset = utf-8',
        success   : function(result){
            console.log(result);
            getCourseSuccess(result);
        }
    });
}

