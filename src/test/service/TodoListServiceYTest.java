package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceYTest {
    public static void main(String[] args) {

        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java Dasar");
        todoListRepository.data[1] = new Todolist("Belajar Java OOP");
        todoListRepository.data[2] = new Todolist("Belajar Java Standart Classes");


        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standart Clasess");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standart Clasess");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }

}
