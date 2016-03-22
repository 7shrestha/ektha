function sendCources() {
	var cources = $(".trendingCource");
	var urlStr = "submitCource.jsp?";
	for (var i = 0; i < cources.length; i++) {
		if (cources[i].checked) {
			urlStr = urlStr + cources[i].id + "=" + cources[i].value + "&";
		}
	}

	$.ajax({
		url : urlStr,
		cache : false,
		dataType : "html",
		timeout : 300000,
		success : function(data, textStatus) {
			document.getElementById("enrolled").innerHTML = 'You are enrolled Successfully!!';
		},
		error : function(xhrRequest, textStatus, errorThrown) {
			$("#enrolled").html('Unsuccessful!!');
		}
	});
}