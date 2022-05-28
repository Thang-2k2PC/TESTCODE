using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class IG : MonoBehaviour
{ 
    public GameObject Spawn;
    public GameObject Cac;
    // Start is called before the first frame update
    void Start()
    {
        InvokeRepeating("a", 1, 2.5f);
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    void a()
    {
        Spawn = Instantiate(Cac, transform.position, Quaternion.identity) as GameObject;
    }
}
