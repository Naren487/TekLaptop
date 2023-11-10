import { useLocation, useParams } from "react-router-dom";

const Index=(props)=>{
    const state=useParams();
    console.log(state.id);
    return(
        <h3>Index</h3>
    );
}
export default Index;