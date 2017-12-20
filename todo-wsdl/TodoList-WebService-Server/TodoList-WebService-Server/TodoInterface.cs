using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TodoList_WebService_Server
{
    interface TodoInterface
    {
        void addTodo(Todo todo);
        List<Todo> getAllTodos();
        void deleteTodo(long Id);
        void updateTodo(Todo todo);
    }
}
