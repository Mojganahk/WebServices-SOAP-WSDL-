using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace TodoList_WebService_Server
{
    public class Todo
    {

        public long Id;
        public String Task;
        public DateTime DueDate;
        public Boolean IsDone;
    }
}