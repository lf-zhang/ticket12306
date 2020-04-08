//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.solr.client.solrj.beans.Field;

import java.util.Objects;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class articles {
    @Field("id")
    private String id;
    @Field("name")
    private String name;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "articles{id='" + this.id + '\'' + ", name='" + this.name + '\'' + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof articles)) {
            return false;
        } else {
            articles articles = (articles)o;
            return this.getId().equals(articles.getId()) && this.getName().equals(articles.getName());
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.getId(), this.getName()});
    }

    public articles() {
    }

    public articles(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static final class Fields {
        public static final String id = "id";
        public static final String name = "name";

        private Fields() {
        }
    }
}
