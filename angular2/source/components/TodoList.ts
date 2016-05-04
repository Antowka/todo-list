import {Component, Inject} from 'angular2/core';
import {TasksService} from "../services/TasksService";
import {TodoNew} from "./TodoNew";

@Component({
    selector:'todo-list',
    directives:[TodoNew],
    template: `
        <ul class="nav nav-pills nav-stacked">
            <li role="presentation" *ngFor="#task of todos">
                <a href="#" (click)="selectNewTask(task)">
                    {{task.name}}
                </a>
            </li>
        </ul>
        
        <todo-new></todo-new>
    `
})
export class TodoList{

    private todos:any[];

    constructor(@Inject(TasksService) private TasksService) {
        //подписка на изменение TasksService.tasks
        TasksService.tasks.subscribe(newTasks => this.todos = newTasks);
        
        this.TasksService.fetchTasks();
    }

    private selectNewTask(task) {
        this.TasksService.selectTask(task);
    }
}