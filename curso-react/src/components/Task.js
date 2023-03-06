import React from "react";
import "./Button";
import Button from "./Button";
import "./Task.css";
import { CgClose, CgInfo } from "react-icons/cg";

const Task = ({ task, handleTaskClickCompleted, handleTaskRemove }) => {
  return (
    <div
      className="task-container"
      style={
        task.completed
          ? { borderLeft: "6px solid white", transition: "140ms ease-in-out" }
          : { borderLeft: "0px solid white", transition: "85ms ease-in-out" }
      }
    >
      <div
        className="task-tittle"
        onClick={() => handleTaskClickCompleted(task.id)}
      >
        {task.tittle}
      </div>
      <div id="boxButton">
        <Button className onClick={() => handleTaskRemove(task.id)}>
          <CgClose />
        </Button>

        <Button>
          <CgInfo />
        </Button>
      </div>
    </div>
  );
};

export default Task;
