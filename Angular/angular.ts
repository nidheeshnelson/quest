class Nidheesh{
    n:String;
a:any;
get(){
    console.log(this.n+""+this.a);
}
}
let obj=new Nidheesh();
obj.n="hello";
obj.a=37;
obj.get();