import { useState } from "react";


function ObjectArray() {


    const [cars, setCars] = useState([]);

    function handleAddCar(){
        const year = document.getElementById("yearInput").value;
        const make = document.getElementById("makeInput").value;
        const model = document.getElementById("modelInput").value;

        const newCar = {year: year, make: make, model: model};
        setCars(c => ([...c, newCar]));
    }

    function removeCar(index){
        setCars(cars.filter((_, i) => i !== index))
    }



    return(

        <div>

            <h1>Car List</h1>

            <ul>
                {cars.map((car, index) => 
                <li onClick={() => removeCar(index)} key={index}> {car.year} {car.make} {car.model} </li> )}
            </ul>

            <input id="yearInput" type="number" placeholder="Input year..."/> <br />
            <input id="makeInput" type="text" placeholder="Input make..."/> <br />
            <input id="modelInput" type="text" placeholder="Input model..."/> <br />
            <button onClick={handleAddCar}>Add car</button>

        </div>

    );

}

export default ObjectArray