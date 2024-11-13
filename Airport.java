
package Flights;

public record Airport(String nom,String address,String code) {
    public Airport{
        if(nom==null || nom.isEmpty()){
            throw new IllegalArgumentException("Airport name cannot be empty");
        }
        if(address==null || address.isEmpty()){
            throw new IllegalArgumentException("Airport name cannot be empty");
        }
        if(code==null || code.length()<3){
            throw new IllegalArgumentException("Airport code must be at least 3 letters long");
        }
    }
    
    @Override
    public String toString() {
        return "Airport{" + "nom=" + nom + ", address=" + address + ", code=" + code + '}';
    }
}

