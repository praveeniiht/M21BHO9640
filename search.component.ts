import { Component, OnInit } from '@angular/core';
import { Comments } from '../Comments';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor() { }

  comments: Comments[]=[
    {'cid':9001,'commenter':'sunil','pid':1001,'comment':'your notes is so simple'},
    {'cid':9002,'commenter':'kishore','pid':1001,'comment':'please give elaborated discussion'},
    {'cid':9003,'commenter':'sunil','pid':1002,'comment':'most time waste topic for india'},
    {'cid':9004,'commenter':'kishore','pid':1002,'comment':'Teenages must have good knowledge on politics'},
    {'cid':9005,'commenter':'Anjali','pid':1004,'comment':'Can you explain more on this'}

  ];

  cid:number=0;

  ngOnInit(): void {
  }

searchComment(){
  var isFound:boolean=false;

for(let cnt of this.comments){
  if(this.cid==cnt.cid)
    {
      isFound=true;
      break;
    }
}
if(isFound)
  console.log('The Comment Found');
  else
  console.log('Comment not found...')
}

}
