import React, {useState} from "react";

function MyComponent(){
    const [name, setName] = useState("Guest");
    const [age, setAge] = useState(0);
    const [isEmployed, setIsEmployed] = useState(false);

    const updateName = () => {
        setName("Cosetto")
    }

    const increamentAge = () => {
        setAge(age + 1)
    }

    const toggleEmployStatus = () => {
        setIsEmployed(!isEmployed);
    }

    return (
        <div>
            <p>Name: {name}</p>
            <button onClick={updateName}>Set Name</button>

            <p>Age: {age}</p>
            <button onClick={increamentAge}>Increase Age</button>

            <p>Employment: {isEmployed ? "Yes": "No"}</p>
            <button onClick={toggleEmployStatus}>Set Employment</button>
        </div>
    );
}


export default MyComponent