import { Component } from '@angular/core';
import {FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'react-forms-example';
  uname='';
  
  constructor(private router:Router){

  }
  contactForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    email: new FormControl(),
    gender: new FormControl(),
    isMarried: new FormControl(),
   })

  onSubmit() {
    console.log(this.contactForm.value);
    console.log(this.contactForm.get("firstname")?.value);
    var fname=this.contactForm.get("firstname")?.value;
    var lname=this.contactForm.get("lastname")?.value;
    if(fname=="praveen" && lname=="kumar"){
        this.router.navigateByUrl('/test');
    }
}
}
