import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  constructor(private httpClient:HttpClient ) { }

  getAllComments(){
     return  this.httpClient.get("http://localhost:8083/comments/all");
  }
}
