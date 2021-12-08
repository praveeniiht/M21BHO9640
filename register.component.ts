import { Component, OnInit } from '@angular/core';
import { Comments } from '../Comments';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  cid=9001;
  commenter='sunil';
  pid=1001;
  comment=' your notes is so simple';
  

  constructor() { }

  ngOnInit(): void {
   

  }
  postComment(){
    // write the code for the springboot connectivity
    console.log(this.cid+' '+this.commenter+" "+this.pid+' '+this.comment);
  }

}
