alert("Hi this is Nidheesh Nelson");
document.getElementsByClassName("me")[1].innerHTML="Me";
let a=2;
let b="He";
let c=56;
let d=a+c;
document.write(d);
alert(d);
window.alert(b);
function myMap() {
    var mapProp= {
      center:new google.maps.LatLng(8.3811,77.0421),
      zoom:5,
    };
    var map = new google.maps.Map(document.getElementById("map"),mapProp);
}
