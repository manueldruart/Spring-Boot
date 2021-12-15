package be.technocite.ecarfinal.car.exception;


// RuntimeException permet d'eviter de mettre un throws dans la signature de la methode
// et par consequen de devoir gerer l'exception plus hqut qvec un tryc catch

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CarConflictException extends RuntimeException {

    public int id;

    public CarConflictException(int id) {
        this.id = id;
    }
}

