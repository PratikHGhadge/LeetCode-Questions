class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        
        int n = (int) score.size();
        
        priority_queue< pair<int,int> > pq ;
        
        for(int i=0;i<n;i++){
            pq.push( { score[i],i } );
        }
        
        vector<string>ans(n);
        
        int cnt = 0;
        
        while(pq.size()){
            cnt++;
            auto [x,y] = pq.top(); pq.pop();
            if(cnt>3){
                ans[y] = to_string(cnt);
            }
            else{
                if(cnt==1){
                    ans[y] = "Gold Medal";
                }
                else if(cnt==2){
                    ans[y] = "Silver Medal";
                }
                else{
                    ans[y] = "Bronze Medal";
                }
            }
        }
        return ans;
    }
};