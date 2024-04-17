import logo from './assets/image-default.png'

export default function Admin() {
    return(
        <>
            <section id="menu">
                <div className="logo">
                    <h2>BARBERSHOP</h2>
                </div>
                <div className="items">
                    <li><i class="fa-solid fa-users"></i><a href="#">Employees</a></li>
                    <li><i class="fa-solid fa-users"></i><a href="#">Customers</a></li>
                    <li><i class="fa-solid fa-list-ul"></i><a href="#">Appointment</a></li>
                    <li><i className="fa-solid fa-right-from-bracket"></i><a href="#">Log out</a></li>
                </div>
            </section>
            <section id="interface">
                <div className="navigation">
                    <div className="n1">
                        <div>
                            <i id="menu-btn" className="fa-solid fa-bars"></i>
                        </div>
                        <div className="search">
                            <i className="fa-solid fa-magnifying-glass"></i>
                            <input type="text" name="search" placeholder="Search" />
                        </div>
                    </div>
                    <div className="profile">
                        <i className="fa-solid fa-bell"></i>
                        <img src={logo} alt="avata"/>
                    </div>
                </div>
                <h3 className="i-name">
                    EMPLOYEES
                </h3>

                <div className="values">
                    <div className="val-box">
                        <i className="fa-solid fa-users"></i>
                        <div>
                            <h3>20</h3>
                            <span>Employees</span>
                        </div>
                    </div>
                    <i class="fa-solid fa-user-plus" id='icon-add'></i>
                </div>
                <div className="board">
                    <table>
                        <thead>
                            <tr>
                                <td></td>
                                <td>Name</td>
                                <td>Title</td>
                                <td>Status</td>
                                <td>Role</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>Rock</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>David Jame</h5>
                                        <p>jame@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                            <tr>
                                <td className="edit">
                                    <a href="#" className='button-edit'><i class="fa-solid fa-user-pen"></i></a>
                                    <a href='#' className='button-delete'><i class="fa-solid fa-user-minus"></i></a>
                                </td>
                                <td className="people">
                                    <img src={logo} alt="avata" />
                                    <div className="people-de">
                                        <h5>John Doe</h5>
                                        <p>john@example.com</p>
                                    </div>
                                </td>

                                <td className="people-des">
                                    <h5>Sofware Engineer</h5>
                                    <p>Web dev</p>
                                </td>

                                <td className="active">
                                    <p>Active</p>
                                </td>

                                <td className="role">
                                    <p>Owner</p>
                                </td>   
                            </tr>
                        </tbody>
                    </table>
                </div>
            </section>
        </>
    );
}