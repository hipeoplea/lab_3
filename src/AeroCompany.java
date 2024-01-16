public class AeroCompany {
    private Plane[] planes;

    private boolean known;

    AeroCompany(Plane[] planes, boolean known) throws NullPlaneValuePassedException{
        for (int i = 0; i < planes.length; i++){
            if (planes[i] == null ){
                throw new NullPlaneValuePassedException(i);
            }
        }
        this.planes = planes;
        this.known = known;
    }

    public String CreateNews(){
        class News{
            final private boolean secret;
            public News(boolean secret){
                this.secret = secret;
            }

            public String getNews(){
                if (secret){
                  return "Срочная новость пивной бочонок опознан - это Карлсон";
                };
                return "Мы не можем ничего сказать";
            }
        }
        News news = new News(known);
        return news.getNews();

    }
}
