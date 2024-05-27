import { useState } from "react"


function MyComponent(){

    const [car, setCar] = useState({year: 2024, make: "Ford", model: "Mustang"});



    const handleYearEvent = (event) => {
        // ... is call spread operator
        setCar(c=>({...c, year: event.target.value}));
    }
    const handleMakeEvent = (event) => {
        // ... is call spread operator
        setCar(c=>({...c, make: event.target.value}));
    }
    const handleModelEvent = (event) => {
        setCar(c=>({...c, model: event.target.value}));
    }



    const [foods, setFood] = useState(["apple", "banana", "orange"]);
    
    function handleAddFood(){
        const newFood = document.getElementById("foodInput").value;
        document.getElementById("foodInput").value = "";
        setFood(f => ([...f, newFood]))
    }
    function handleRemoveFood(index){
        setFood(foods.filter((_, i) => i !== index));
    }


    return(
        <>
        <h1>Update object</h1>
            <div>
                <p>Your facvorite car is: {car.year} {car.make} {car.model}</p>
                <input type="number" value={car.year} onChange={handleYearEvent} /> <br />
                <input type="text" value={car.make} onChange={handleMakeEvent} /> <br />
                <input type="text" value={car.model} onChange={handleModelEvent} />
            </div>

            <h1>Update Array</h1>
            <div>
                <p>Food list:</p>
                <ul>
                    {foods.map((food, index) => <li onClick={() => handleRemoveFood(index)} key={index}>{food}</li>)}
                </ul>

                <input id="foodInput" type="text" placeholder="Input food..."/>
                <button onClick={handleAddFood}>Add food</button>
            </div>
        </>
    );

}

export default MyComponent