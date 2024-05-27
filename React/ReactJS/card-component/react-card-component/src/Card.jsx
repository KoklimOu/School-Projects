import profilePic from './assets/cosette.png'

function Card(){


    return(
        <div className="card">
            <img alt="profile picture" src={profilePic}></img>
            <h2>Cosetto</h2>
            <p>I fucked up, and unemployed.</p>
        </div>
    );

}

export default Card