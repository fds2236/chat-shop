import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Post from "./Post";

const SingUp = () => {
    // 주소
    const [enroll_company, setEnroll_company] = useState({address:'',});

    // 팝업
    const [popup, setPopup] = useState(false);
    
    const handleInput = (e) => {
        setEnroll_company({
            // ... => enroll_company에 다 담겠다는 의미
            ...enroll_company,
            [e.target.name]:e.target.value,
        })
        console.log(e.target.name);
    }
    
    const handleComplete = (data) => {
        setPopup(!popup);
    }
        
    return(
        <>
        <h1>회원가입</h1>
        <div className="address_search">주소 
        <input className="user_enroll_text" type="text" required={true} name="address" onChange={handleInput} value={enroll_company.address}/>
        <button onClick={handleComplete}>주소찾기</button>
        {popup && <Post company={enroll_company} setcompany={setEnroll_company}></Post>}
        </div>
        </>
    )
}
export default SingUp;