class RecentCounter {
LinkedList<Integer> slidewindow;
    
    public RecentCounter() {
        this.slidewindow = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
     this.slidewindow.addLast(t);
        
        while(this.slidewindow.size()>0){
            if(this.slidewindow.getFirst()<t-3000){
                this.slidewindow.removeFirst();
            }
            else{
                break;
            }
        }
        return this.slidewindow.size();
    }
}
