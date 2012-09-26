package org.jarvis.db.repo;

import java.util.List;

import org.jarvis.db.model.EveStatic;

public abstract class AbstractRepo<T extends EveStatic> {
	public abstract T load(int id);
	public abstract void save(T eveStatic);
	public abstract List<T> search(String field, Object value);
}
