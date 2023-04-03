import React from 'react'
import { useState, useEffect } from "react"
import { BrowserRouter as Router,  Route, Routes } from 'react-router-dom';
import './App.css';
import Header from './components/Header';
import Tasks from './components/Tasks';
import AddTask from './components/AddTask';
import Footer from './components/Footer';
import Dashboard from './components/Dashboard';


function App() {

  const [showAddTask, setShowAddTask] = useState(false);

  const [tasks, setTasks] = useState([])

  useEffect(() => {
      const getTasks = async () => {
        const dataFromServer = await fetchTasks()
        setTasks(dataFromServer)
      }

      getTasks()
  }, [])


  const fetchTasks = async () => {
    const res = await fetch('http://localhost:3333/tasks/');
    const data = await res.json();
    return data;
  }





  const onTaskReminder = (id) => {
    setTasks(
      tasks.map((task) => task.id === id ?{...task, reminder:!task.reminder}: task))
  
  }


  const addTask = async (task) => {

    const res = await fetch('http://localhost:3333/tasks', {
      method: 'POST',
      headers: {
        'Content-type': 'application/json'
      },
      body: JSON.stringify(task)
    })

    const data = await res.json()
    setTasks([...tasks, data])



   //  const id = Math.floor(Math.random()*10000+1);
    // console.log(id);

   //  const newTask = { id, ...task}
    // setTasks([...tasks, newTask])
  }
  


  
  const deleteTask = async (id) => {

      await fetch(`http://localhost:3333/tasks/${id}`,{
        method: 'DELETE'
      })

    // updating the state (id is passed)
      setTasks(tasks.filter((task) => task.id !== id))
  }


  
// // add task
//   const addTask = async (task) => {

//     const res = await fetch('http://localhost:3333/tasks', {
//       method: 'PUT',
//       headers: {
//         'Content-type': 'application/json'
//       },
//       body: JSON.stringify(task)
//     })

//     const data = await res.json()
//     setTasks([...tasks, data])   
//   }
  return (
    <Router>
      <div className="container">
        <Header onAdd={ () => setShowAddTask(!showAddTask)} showAddTask={showAddTask}/>

      <Routes>
            <Route path='/' exact element= {
          
                  <>
                  {showAddTask && <AddTask onAdd={addTask}/>}
                      
                      {tasks.length > 0 ? 
                      <Tasks tasks={tasks}
                      onDelete={deleteTask} 
                      onReminder={onTaskReminder}/>
                      : ('No tasks to display')}
                  </>
                
                }
              />   
          <Route path='/dashboard' element={<Dashboard />}/>
          
      </Routes>
    <Footer/> 
    </div>
    </Router>
  );
}

export default App;
