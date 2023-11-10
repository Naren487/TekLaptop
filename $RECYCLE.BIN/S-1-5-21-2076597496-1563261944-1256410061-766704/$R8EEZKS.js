var UserProfile = (function() {
    var Fname = "";
  
    var getName = function() {
      return Fname;    // Or pull this from cookie/localStorage
    };
  
    var setName = function(name) {
      Fname = name;     
      // Also set this in cookie/localStorage
    };
  
    return {
      getName: getName,
      setName: setName
    }
  
  })();
  
  export default UserProfile;