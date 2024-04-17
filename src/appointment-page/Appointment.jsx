

export default function Appointment() {
    return (
        <>
            <section className="container">
                <header>Make an  Appointment</header>
                <form action="#" className="form">
                <div className="input-box">
                    <label>Full Name</label>
                    <input type="text" placeholder="Enter full name" required />
                </div>
                <div className="column">
                    <div className="input-box">
                    <label>Email Address</label>
                    <input type="text" placeholder="Enter email address" required />
                    </div>
                    <div className="input-box">
                    <label>Phone Number</label>
                    <input type="text" placeholder="Enter phone number" required />
                    </div>
                </div>
                <div className="column">
                    <div className="input-box">
                    <label>Favorite Time</label>
                    <div className="select-box">
                        <select>
                            <option hidden>Choose favorite time</option>
                            <option>8h - 11h30'</option>
                            <option>13h - 17h30'</option>
                            <option>18h - 21h30'</option>
                        </select>
                    </div>
                    </div>
                    <div className="input-box">
                    <label>Birth Date</label>
                    <input type="text" placeholder="dd / mm / yyyy" required />
                    </div>
                </div>
                <div className="input-box address">
                    <div className="column">
                        <div className="input-box">
                        <label>Services</label>
                        <div className="select-box">
                            <select>
                                <option hidden>Choose Services</option>
                                <option>Haircut</option>
                                <option>shave</option>
                                <option>makeup</option>
                                <option>other</option>
                            </select>
                        </div>
                        </div>
                        <div className="input-box">
                        <label>Selecting A Waiter</label>
                        <div className="select-box">  
                            <select>
                                <option hidden>Staff</option>
                                <option>John Joe</option>
                                <option>Davis James</option>
                            </select>
                        </div>
                        </div>
                    </div>
                </div>
                <button>Submit</button>
                </form>
            </section>
        </>
    )
}