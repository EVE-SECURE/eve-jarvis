package org.jarvis.db.repo.inventory;

import java.util.List;

import org.jarvis.db.model.inventory.Type;
import org.jarvis.db.repo.AbstractRepo;

public class TypeRepo extends AbstractRepo<Type> {

	@Override
    public Type load(int id) {
	    return null;
    }

	@Override
    public void save(Type eveStatic) {
    }

	@Override
    public List<Type> search(String field, Object value) {
		return null;
	}

}
