package egg.actions.services;

import egg.models.mainModels.FieldModel;
import egg.models.mainModels.UserModel;

public interface FieldService {

    void getFreeField(UserModel user);

    void buyTheField(FieldModel field, UserModel user);

    void attackTheField();

    void fillInTheField();

    void likeTheField();
}
