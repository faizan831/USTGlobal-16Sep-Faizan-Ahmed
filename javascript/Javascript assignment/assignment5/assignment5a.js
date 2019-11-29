var objPeople = [
	{ // Object @ 0 index
		username: "faizan",
		password: "faizan"
	},
	{ // Object @ 1 index
		username: "shareef",
		password: "shareef"
	},
	{ // Object @ 2 index
		username: "ghazan",
		password: "ghazan"
	}

]

function getInfo() {
	var username = document.getElementById('username').value
	var password = document.getElementById('password').value

	for(var i = 0; i < objPeople.length; i++) {
		// check is user input matches username and password of a current index of the objPeople array
		if(username === objPeople[i].username && password == objPeople[i].password) {
			console.log(username + " is logged in!!!")
			// stop the function if this is found to be true
			return
		}
	}
    console.log("incorrect username or password");
}
function myFunction() {
	var x = document.getElementById("myInput");
	if (x.type === "password") {
	  x.type = "text";
	} else {
	  x.type = "password";
	}
  }
  