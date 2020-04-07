package cn.train.enity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class articles   {
    @Field("id")
    private String id;

    @Field("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "articles{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        articles articles = (articles) o;
        return Objects.equals(name, articles.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
