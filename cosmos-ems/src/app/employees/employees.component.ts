import { Component, OnInit } from '@angular/core';
import employees from './data/employees.json';


@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  title: string = 'Employee Management Solution'
  employees: any[] = employees;
  showIcon: boolean = false; 

  constructor() { }

  ngOnInit(): void {
  }

  toggleIcon(){
    this.showIcon = !this.showIcon;
  }

}
