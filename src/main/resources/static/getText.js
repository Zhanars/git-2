$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9091/get/text"
    }).then(function(data) {
        $('.content').append(data["0"]["text"]);
        console.log(data);
        console.log(data["0"]["text"]);
    });
});