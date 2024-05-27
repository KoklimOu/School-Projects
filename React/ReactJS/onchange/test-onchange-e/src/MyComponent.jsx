// the onchange event tiggered every time the value of  the input change.



import {useState} from "react";

function MyComponent(){
    const [name, setName] = useState("");

    const handleNameChange = (event) => {
        setName(event.target.value)
    }

    return (

        <div>
            <input value={name} onChange={handleNameChange}/>
            <p>Name: {name}</p>
        </div>

    );
}

export default MyComponent