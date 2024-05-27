import { useState } from "react";


function ColorPicker(){


    const [color, setColor] = useState("#FFFFFF");
    const selectColor = (event) => {
        setColor(event.target.value);
    }

    return (

        <div className="color-picker-container">
            <h1>Color Picker</h1>
            <div className="color-display" style={{backgroundColor: color}}>
                <p className="color-picker" >Selected Color: {color}</p>
            </div>
            <label>Select a Color</label>
            <input type="color" value={color} onChange={selectColor} />
        </div>

    );
}

export default ColorPicker