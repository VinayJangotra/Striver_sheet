bool printS(int idx,vector<int>&ans,vector<int>&a,int sum,int k){

    //base case

    if(idx==a.size()){

        if(sum==k){

            return true;

        }else{

            return false;

        }

    }

    //edge case

    if(sum>k){

        return false;

    }

   //pick one

    ans.push_back(a[idx]);

    sum+=a[idx];

    if(printS(idx+1,ans,a,sum,k)==true){

        return true;

    }

    sum-=a[idx];

    //not pick

    if(printS(idx+1,ans,a,sum,k)==true){

        return true;

    }

    return false;

}

bool isSubsetPresent(int n, int k, vector<int> &a)

{

    vector<int>ans;

    bool res=printS(0,ans,a,0,k);

    return res;

}
