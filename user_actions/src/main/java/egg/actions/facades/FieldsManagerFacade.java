package egg.actions.facades;

import egg.models.mainModels.FieldModel;
import egg.models.mainModels.UserModel;

public interface FieldsManagerFacade{

    void getFreeField(UserModel user);

    void buyTheField(FieldModel field, UserModel user);

    void attackTheField();

    void fillInTheField();

    void likeTheField();
}
