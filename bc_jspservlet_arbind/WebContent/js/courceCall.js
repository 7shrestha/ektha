	  function getCources() {
		var programId = document.getElementById("cource").value;
		var urlStr = "cource.jsp" + "?programName=" + programId;

		$.ajax({
			url : urlStr,
			cache : false,
			dataType : "html",
			timeout : 300000,
			success : function(data, textStatus) {
				document.getElementById("availableCources").innerHTML = '';
				document.getElementById("availableCources").innerHTML = data;
			},
			error : function(xhrRequest, textStatus, errorThrown) {
				$("#availableCources").html('');
			}
		});
	}  
