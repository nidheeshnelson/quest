// Access by id
var a = document.getElementById("hh");
console.log(a);
a.innerHTML ="Changed Document Object Model";
a.style.color ="red";

// Access by class name
var b = document.getElementsByClassName("cl");
console.log(b);
b[0].innerHTML ="Changed DOM";
b[1].style.color="green";
b[1].innerHTML = "I am Nidheesh Nelson";

// Access by tagname
var c = document.getElementsByTagName("h2");
console.log(c);
c[1].innerHTML="Taged You";
c[1].style.color="pink";

//Access by Name
var d = document.getElementsByName("nidheesh")[0];
var e = document.getElementById("dd");
console.log(d);

function nid(){
    e.innerHTML ="Hello " +d.value;
}

//Access by css selectors
var f = document.querySelectorAll("h1");
console.log(f);
f[2].innerHTML="Learn HTML";
f[3].style.color="yellow";
//class name
var g = document.querySelectorAll(".no");
console.log(g);
g[0].style.color="red";
//id name
var h = document.querySelectorAll("#new");
console.log(h);
h[0].innerHTML="You are Learning Java Script HTML";

// Create