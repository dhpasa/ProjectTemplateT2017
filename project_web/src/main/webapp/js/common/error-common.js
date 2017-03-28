
var errorHtml = "<span id=\"spanError\" class=\"error\" onmouseover=\"makeMesDiv(this)\" onmouseout=\"removeMesDiv()\"><img src=\"../images/error.png\"/></span>";
	
function cleanFormError() {
	$("#spanError").remove();
}

function showErrorSpan(obj, msg){
	$(obj).after(errorHtml);
	$(obj).next().append(msg);
}