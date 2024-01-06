import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MediatorService {

  constructor() { }
//   setData(data:any){
// this.springAddData(data).then((response:any)=>{
//  return response})
//   }

  getData(){
this.SpringViewData().then((response:any)=>{
  return response})
  }

  springAddData=(data:any)=>{
    console.log(`in spring boot data function${data}`)
return new Promise((resolve,reject)=>{
  let url='http://localhost:8080/add'
  let encode={
    method:"POST",
    headers:{'Content-Type': 'application/json'},
    body:JSON.stringify({
      name:data['name'],
      age:data['age'],
      place:data['place']
    })
  }
  fetch(url,encode)
  .then(async(response)=>{
response=await response.json()
// console.log(`response from spring add data${JSON.stringify(response)}`)
resolve(response)
  })
  .catch((error)=>{
reject(error)
  })
})
  }

SpringViewData=()=>{
  return new Promise((resolve,reject)=>{
    let url='http://localhost:8080/view'
    fetch(url)
    .then(async(response)=>{
      response=await response.json()
      console.log(`response from spring view data${JSON.stringify(response)}`)
      resolve(response)
    })
    .catch((error)=>{
      reject(error)
    })
  })
}
}
