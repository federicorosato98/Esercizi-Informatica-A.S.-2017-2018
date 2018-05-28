var valute = [];
var xhttp = new XMLHttpRequest();

xhttp.onreadystatechange = function () {
	if (this.readyState === 4 && this.status === 200) {
		valute = JSON.parse(xhttp.response);
	}
};
xhttp.open("GET", "myJson.json", true);
xhttp.send();

for (var i = 0; i < valute.length; i++) {
	document.getElementById("val1").appendChild(new Option(valute[i]));
}

