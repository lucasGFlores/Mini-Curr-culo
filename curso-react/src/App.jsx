import React, { useState } from "react";
import { v4 as uuidv4 } from "uuid";

import AddTask from "./components/AddTask";
import Header from "./components/Header";
import "./App.css";
import Tasks from "./components/Tasks";

const App = () => {
  const [tasks, setTasks] = useState([
    {
      id: "1",
      tittle: "explodir a união soviética",
      completed: false,
    },
    {
      id: "2",
      tittle: "estudar programation",
      completed: false,
    },
  ]);
  const handleTaskAddition = (taskTittle) => {
    if (taskTittle === "") {
      taskTittle = "MAS NUM TEM NADA";
    }
    const newTask = [
      ...tasks,
      {
        tittle: taskTittle,
        id: uuidv4(),
        completed: false,
      },
    ];
    setTasks(newTask);
  };
  const handleTaskClickCompleted = (taskId) => {
    const newTasks = tasks.map((task) => {
      if (task.id === taskId) {
        return { ...task, completed: !task.completed };
      }
      return task;
    });
    setTasks(newTasks);
  };
  const handleTaskRemove = (taskId) => {
    const newTasks = tasks.filter((task) => {
      return taskId !== task.id;
    });
    setTasks(newTasks);
  };
  return (
    <>
      <div className="container">
        <Header />
        <AddTask handleTaskAddition={handleTaskAddition}></AddTask>
        <Tasks
          tasks={tasks}
          handleTaskClickCompleted={handleTaskClickCompleted}
          handleTaskRemove={handleTaskRemove}
        />
      </div>
    </>
  );
};

export default App;
