import {Component} from 'angular2/core';

@Component({
    selector:'todo-new',
    template: `
       <form class="form-horizontal">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Text input" />
            </div>
            <div class="form-group">
                <textarea class="form-control" placeholder="Text input"></textarea>
            </div>
            <button type="button" class="btn btn-primary">Add</button>
       </form>
    `
})
export class TodoNew{
    constructor() {}
}
