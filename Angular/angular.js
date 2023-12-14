var Nidheesh = /** @class */ (function () {
    function Nidheesh() {
    }
    Nidheesh.prototype.get = function () {
        console.log(this.n + "" + this.a);
    };
    return Nidheesh;
}());
var obj = new Nidheesh();
obj.n = "hello";
obj.a = 37;
obj.get();
