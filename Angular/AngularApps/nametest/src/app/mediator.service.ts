import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MediatorService {

  constructor() { }
  name:any
names:any
viewforall:any
  setName(data:any){
    this.name = data['name28']
    // console.log(data['age']);
    // console.log(`in setname function of Service : ${this.name}`);
    this.addName(data).then((res:any)=>{this.names=res})
  }
  getdata(datas:any){
    this.viewforall=datas
this.names=datas['name1']
console.log(`in get data function of service: ${this.names}`)
  }
  viewName(){
    return this.names
  }
  viewAll(){
    return this.viewforall
  }
getComments = () =>{

  return new Promise((resolve, reject)=>{
    let url = 'https://jsonplaceholder.typicode.com/posts'
  
    fetch(url)
    .then(async (respose)=>{
      respose = await respose.json()
      resolve(respose)
    })
    .catch((err)=>{
      reject(err)
    })
    // fetch().then().then().catch()
  })
}

addName = (data:any)=>{
  return new Promise((resolving, rejecting)=>{
    let url = 'http://localhost:8080/ad'
    fetch(url,{
      method: "POST",
      headers: {
        'Content-Type': 'application/json', // Update this line
        // Add any additional headers as needed
      },
      body: JSON.stringify({
        name: data['name28'],
      }),
    })
    .then(async (response)=>{
      response =await response.json()
      console.log(response);
      
      resolving(response)
    })
    .catch((error)=>{
      rejecting(error)
    })
  })
}
}
