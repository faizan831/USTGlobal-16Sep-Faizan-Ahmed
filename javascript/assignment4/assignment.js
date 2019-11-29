[2:22 PM, 9/24/2019] Shareef 1: var div=[{
    id:1,
    price:5000,
    brand:"fasttrack"
},{
    id:2,
    price:100000,
    brand:'r15'
},{
    id:3,
    name:'suvarna',
    channelno:701,
    price:30000
},{
    id:4,
    name:'dell',
    price:45000
},{
    id:5,
    name:'0neplussix',
    price:27000
},{
    id:6,
    name:'ust global india',
    salary:'3.5lpa',
    price:3000000
},{
     name:'harsha',
     age:22,
     bloodgroup:'ab+',
     price:600000
},{
    id:8,
    brand:'kingfisher',
    price:3000
},{
    id:9,
    founder:'india',
    playersallowed:7,
    price:100
},{
    id:10,
    founder:'england',
    playerallowed:11,
    price:200
}]

 const n1=div.map(function(object,index){
     let n1=object.price+300
    
     console.log('new array after map',n1)
 
 })
 console.log("==============filter price greater than 1000=======================")


 var div=[{
    id:1,
    price:500,
    brand:"fasttrack"
},{
    id:2,
    price:100000,
    brand:'r15'
},{
    id:3,
    name:'suvarna',
    channelno:701,
    price:300
},{
    id:4,
    name:'dell',
    price:45000
},{
    id:5,
    name:'0neplussix',
    price:27000
},{
    id:6,
    name:'ust global india',
    salary:'3.5lpa',
    price:3000000
},{
     name:'harsha',
     age:22,
     bloodgroup:'ab+',
     price:600000
},{
    id:8,
    brand:'kingfisher',
    price:3000
},{
    id:9,
    founder:'india',
    playersallowed:7,
    price:100
},{
    id:10,
    founder:'england',
    playerallowed:11,
    price:200
}]


function f1(value,index,array){
    if(value.price>1000){
        return array

    }
}

const k1=div.filter(f1);

console.log(k1)



console.log("=======assignment 2==========");
console.log("======for each method==========")

 // 1)
 var fruits=['apple','pineapple','orange']
fruits.forEach(function(value,index){
    console.log('fruits',value)
    console.log('fruits index',index)
});

// 2)
var flowers=['rose','sunflower','lilly']
flowers.forEach(function(value,index){
    console.log('flowers',value)
    console.log('flowers index',index)
});
  // 3)
var movies=['kgf','rajkumara','pailwan']
movies.forEach(function(value,index){
    console.log('movies',value)
    console.log('movies index',index)
});
        // 4)
var channels=['suvarna','zeekannada','colourskannada']
channels.forEach(function(value,index){
    console.log('channels',value)
    console.log('channels index',index)
});
// 5)

var tv=['lg','samsung','phillips']
tv.forEach(function(value,index){
    console.log('tv',value)
    console.log('tv index',index)
});
// 6)
var network=['airtel','bsnl','vodafone']
network.forEach(function(value,index){
    console.log('network',value)
    console.log('network index',index)
});
// 7)

var os=['windows7','windows8','windows9','windows10']
os.forEach(function(value,index){
    console.log('os',value)
    console.log('os index',index)
});

// 8)
var datatype=['int','double','short']
datatype.forEach(function(value,index){
    console.log('datatype',value)
    console.log('datatype index',index)
});
// 9)
var keyword=['class','string','args']
fruits.forEach(function(value,index){
    console.log('keyword',value)
    console.log('keyword index',index)
});
// 10
var apps=['facebook','whatsapp','instagram']
apps.forEach(function(value,index){
    console.log('apps',value)
    console.log('apps index',index)
});

console.log('=======isArray===========')
const f=['grapes','apple','pineapple','orange','mango']
console.log(typeof f)
const o1=Array.isArray(f)
console.log('f is array or not',o1)
console.log(f)

const o2=f.includes('orange',2)
console.log('orange is element of f',o2)
console.log(f)

const o3=f.push('kiwi','moosambi')
console.log('after push method array is',f)
console.log(o3)

const o4=f.pop()
console.log('after pop method array is',f)
console.log(o4)

const o5=f.unshift('pomagranete','banana')
console.log('after unshift method array is',f)
console.log(o5)

const o6=f.shift();
console.log('after shift method array is',f)
console.log(o6)

const o7=f.splice(3,2,'jackfruit','guava')
console.log('after splice method array is',f)
console.log(o7)

const o8=f.slice(2,3)
console.log('after slice method array is',f)
console.log(o8)

const o9=f.join('*')
console.log('after join method array is',f)
console.log(o9)

const o10=f.indexOf('roaming',2)
console.log('after indexof method array is',f)
console.log(o10)

const o11=f.indexOf('jackfruit',2)
console.log('after indexof method array is',f)
console.log(o11)

const o12=f.map(function(value,index){
    let nw=value+60;
    return nw
})
console.log('after map method array is',f)
console.log(o12)


const o13=f.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f)
console.log(o13)

// 2)
var f1=['rose','sunflower','lilly']
console.log(typeof f1)
const z1=Array.isArray(f1)
console.log('f is array or not',z1)
console.log(f1)

const z2=f1.includes('lilly',2)
console.log('orange is element of f',z2)
console.log(f1)

const z3=f1.push('jasmine','hibiscus')
console.log('after push method array is',f1)
console.log(z3)

const z4=f1.pop()
console.log('after pop method array is',f1)
console.log(z4)

const z5=f1.unshift('lotus','daffodil')
console.log('after unshift method array is',f1)
console.log(z5)

const z6=f1.shift();
console.log('after shift method array is',f1)
console.log(z6)

const z7=f1.splice(3,2,'dianella','dahlia')
console.log('after splice method array is',f1)
console.log(z7)

const z8=f1.slice(2,3)
console.log('after slice method array is',f1)
console.log(z8)

const z9=f1.join('*')
console.log('after join method array is',f1)
console.log(z9)

const z10=f1.indexOf('roaming',2)
console.log('after indexof method array is',f)
console.log(o10)

const z11=f1.indexOf('daffodil',2)
console.log('after indexof method array is',f)
console.log(z11)

const z12=f1.map(function(value,index){
    let nw1=value+60;
    return nw1
})
console.log('after map method array is',f1)
console.log(z12)


const z13=f1.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f1)
console.log(z13)


// 3)

var f2=['kgf','rajkumara','pailwan']

console.log(typeof f2)
const y1=Array.isArray(f2)
console.log('f is array or not',y1)
console.log(f2)

const y2=f2.includes('pailwan',2)
console.log('orange is element of f',y2)
console.log(f2)

const y3=f2.push('saaho','dreamgirl')
console.log('after push method array is',f)
console.log(y3)

const y4=f2.pop()
console.log('after pop method array is',f2)
console.log(y4)

const y5=f2.unshift('ugram','3idiots')
console.log('after unshift method array is',f2)
console.log(y5)

const y6=f2.shift();
console.log('after shift method array is',f2)
console.log(y6)

const y7=f2.splice(3,2,'pk','rangitaranga')
console.log('after splice method array is',f2)
console.log(y7)

const y8=f2.slice(2,3)
console.log('after slice method array is',f2)
console.log(y8)

const y9=f2.join('*')
console.log('after join method array is',f2)
console.log(y9)

const y10=f2.indexOf('roaming',2)
console.log('after indexof method array is',f2)
console.log(y10)

const y11=f2.indexOf('pk',1)
console.log('after indexof method array is',f2)
console.log(y11)

const y12=f2.map(function(value,index){
    let nw2=value+60;
    return nw2
})
console.log('after map method array is',f2)
console.log(y12)


const y13=f2.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f2)
console.log(y13)


// 4)
var f3=['suvarna','zeekannada','colourskannada']
console.log(typeof f3)
const x1=Array.isArray(f3)
console.log('f3 is array or not',x1)
console.log(f3)

const x2=f3.includes('zeekannada',1)
console.log('zeekannada is element of f3',x2)
console.log(f3)

const x3=f3.push('tv9','publictv')
console.log('after push method array is',f3)
console.log(x3)

const x4=f3.pop()
console.log('after pop method array is',f3)
console.log(x4)

const x5=f3.unshift('tv5','tv18')
console.log('after unshift method array is',f3)
console.log(x5)

const x6=f3.shift();
console.log('after shift method array is',f3)
console.log(x6)

const x7=f3.splice(3,2,'jackfruit','guava')
console.log('after splice method array is',f3)
console.log(x7)

const x8=f3.slice(2,3)
console.log('after slice method array is',f3)
console.log(x8)

const x9=f3.join('*')
console.log('after join method array is',f3)
console.log(x9)

const x10=f3.indexOf('roaming',2)
console.log('after indexof method array is',f3)
console.log(x10)

const x11=f3.indexOf('jackfruit',2)
console.log('after indexof method array is',f3)
console.log(x11)

const x12=f3.map(function(value,index){
    let nw3=value+60;
    return nw3
})
console.log('after map method array is',f3)
console.log(x12)


const x13=f3.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f3)
console.log(x13)

// 5)
var f5=['lg','samsung','phillips']
console.log(typeof f5)
const w1=Array.isArray(f5)
console.log('f5 is array or not',w1)
console.log(f5)

const w2=f5.includes('phillips',2)
console.log('phillips is element of f5',w2)
console.log(f5)

const w3=f5.push('panasonic','tv3')
console.log('after push method array is',f5)
console.log(w3)

const w4=f5.pop()
console.log('after pop method array is',f5)
console.log(w4)

const w5=f5.unshift('pomagranete','banana')
console.log('after unshift method array is',f5)
console.log(w5)

const w6=f5.shift();
console.log('after shift method array is',f5)
console.log(w6)

const w7=f5.splice(3,2,'jackfruit','guava')
console.log('after splice method array is',f5)
console.log(w7)

const w8=f5.slice(2,3)
console.log('after slice method array is',f5)
console.log(w8)

const w9=f5.join('*')
console.log('after join method array is',f5)
console.log(w9)

const w10=f5.indexOf('roaming',2)
console.log('after indexof method array is',f5)
console.log(w10)

const w11=f5.indexOf('jackfruit',2)
console.log('after indexof method array is',f5)
console.log(w11)

const w12=f5.map(function(value,index){
    let nw5=value+60;
    return nw5
})
console.log('after map method array is',f5)
console.log(w12)


const w13=f5.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f5)
console.log(w13)

// 6)
var f6=['airtel','bsnl','vodafone']
console.log(typeof f6)
const v1=Array.isArray(f6)
console.log('f6 is array or not',v1)
console.log(f6)

const v2=f6.includes('vodafone',2)
console.log('vodafone is element of f6',v2)
console.log(f6)

const v3=f6.push('tatadocomo','idea')
console.log('after push method array is',f6)
console.log(v3)

const v4=f6.pop()
console.log('after pop method array is',f6)
console.log(v4)

const v5=f6.unshift('spice','td1')
console.log('after unshift method array is',f6)
console.log(v5)

const v6=f6.shift();
console.log('after shift method array is',f6)
console.log(v6)

const v7=f6.splice(3,2,'idea2','idea3')
console.log('after splice method array is',f6)
console.log(v7)

const v8=f6.slice(2,3)
console.log('after slice method array is',f6)
console.log(v8)

const v9=f6.join('*')
console.log('after join method array is',f6)
console.log(v9)

const v10=f6.indexOf('roaming',2)
console.log('after indexof method array is',f6)
console.log(v10)

const v11=f6.indexOf('jackfruit',2)
console.log('after indexof method array is',f6)
console.log(v11)

const v12=f6.map(function(value,index){
    let nw6=value+60;
    return nw6
})
console.log('after map method array is',f6)
console.log(v12)


const v13=f6.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f6)
console.log(v13)

// 7)

var f7=['windows7','windows8','windows9','windows10']
console.log(typeof f7)
const u1=Array.isArray(f7)
console.log('f7 is array or not',u1)
console.log(f7)

const u2=f7.includes('windows10',2)
console.log('windows10 is element of f7',u2)
console.log(f7)

const u3=f7.push('windows11','windows12')
console.log('after push method array is',f7)
console.log(u3)

const u4=f7.pop()
console.log('after pop method array is',f7)
console.log(u4)

const u5=f7.unshift('windows13','windows14')
console.log('after unshift method array is',f7)
console.log(u5)

const u6=f7.shift();
console.log('after shift method array is',f7)
console.log(u6)

const u7=f7.splice(3,2,'windows15','windows16')
console.log('after splice method array is',f7)
console.log(u7)

const u8=f7.slice(2,3)
console.log('after slice method array is',f7)
console.log(u8)

const u9=f7.join('*')
console.log('after join method array is',f7)
console.log(u9)

const u10=f7.indexOf('windows12',2)
console.log('after indexof method array is',f7)
console.log(u10)

const u11=f7.indexOf('windows13',2)
console.log('after indexof method array is',f7)
console.log(u11)

const u12=f7.map(function(value,index){
    let nw7=value+60;
    return nw7
})
console.log('after map method array is',f7)
console.log(u12)


const u13=f7.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f7)
console.log(u13)

// 8)
var f8=['int','double','short']
console.log(typeof f8)
const t1=Array.isArray(f8)
console.log('f8 is array or not',t1)
console.log(f8)

const t2=f8.includes('short',2)
console.log('orange is element of f8',t2)
console.log(f8)

const t3=f8.push('long','binary')
console.log('after push method array is',f8)
console.log(t3)

const t4=f8.pop()
console.log('after pop method array is',f8)
console.log(t4)

const t5=f8.unshift('boolean','float')
console.log('after unshift method array is',f8)
console.log(t5)

const t6=f8.shift();
console.log('after shift method array is',f8)
console.log(t6)

const t7=f8.splice(3,2,'float1','float2')
console.log('after splice method array is',f8)
console.log(t7)

const t8=f8.slice(2,3)
console.log('after slice method array is',f8)
console.log(t8)

const t9=f8.join('*')
console.log('after join method array is',f8)
console.log(t9)

const t10=f8.indexOf('roaming',2)
console.log('after indexof method array is',f8)
console.log(t10)

const t11=f8.indexOf('jackfruit',2)
console.log('after indexof method array is',f8)
console.log(t11)

const t12=f8.map(function(value,index){
    let nw8=value+60;
    return nw8
})
console.log('after map method array is',f8)
console.log(t12)


const t13=f8.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f8)
console.log(t13)
// 9)

var f9=['class','string','args']
console.log(typeof f9)
const s1=Array.isArray(f9)
console.log(f9)

const s2=f9.includes('args',2)
console.log('args is element of f9',s2)
console.log(f9)

const s3=f9.push('public','static')
console.log('after push method array is',f9)
console.log(s3)

const s4=f9.pop()
console.log('after pop method array is',f9)
console.log(s4)

const s5=f9.unshift('void','main')
console.log('after unshift method array is',f9)
console.log(s5)

const s6=f9.shift();
console.log('after shift method array is',f9)
console.log(s6)

const s7=f9.splice(3,2,'method','this')
console.log('after splice method array is',f9)
console.log(s7)

const s8=f9.slice(2,3)
console.log('after slice method array is',f9)
console.log(s8)

const s9=f9.join('*')
console.log('after join method array is',f9)
console.log(s9)

const s10=f9.indexOf('roaming',2)
console.log('after indexof method array is',f9)
console.log(s10)

const s11=f9.indexOf('jackfruit',2)
console.log('after indexof method array is',f9)
console.log(s11)

const s12=f9.map(function(value,index){
    let nw9=value+60;
    return nw9
})
console.log('after map method array is',f9)
console.log(s12)


const s13=f9.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f9)
console.log(s13)

// 10)
var f10=['facebook','whatsapp','instagram']
console.log(typeof f10)
const r1=Array.isArray(f10)
console.log('f10 is array or not',r1)
console.log(f10)

const r2=f10.includes('instagram',2)
console.log('instagram is element of f10',r2)
console.log(f10)

const r3=f10.push('bounce','vogo')
console.log('after push method array is',f10)
console.log(r3)

const r4=f10.pop()
console.log('after pop method array is',f10)
console.log(r4)

const r5=f10.unshift('calculator','calender')
console.log('after unshift method array is',f10)
console.log(r5)

const r6=f10.shift();
console.log('after shift method array is',f10)
console.log(r6)

const r7=f10.splice(3,2,'notepad','jspider')
console.log('after splice method array is',f10)
console.log(r7)

const r8=f10.slice(2,3)
console.log('after slice method array is',f10)
console.log(r8)

const r9=f10.join('*')
console.log('after join method array is',f10)
console.log(r9)

const r10=f10.indexOf('roaming',2)
console.log('after indexof method array is',f10)
console.log(r10)

const r11=f10.indexOf('jackfruit',2)
console.log('after indexof method array is',f10)
console.log(r11)

const r12=f10.map(function(value,index){
    let nw10=value+60;
    return nw10
})
console.log('after map method array is',f10)
console.log(r12)


const r13=f10.filter(function(value,index){
    if(index>=5){
        return true
    }
})
console.log('after filter method array is',f10)
console.log(r13)


console.log('=====================================================')
var q1='hello world'
const c1=q1.toUpperCase();
console.log(c1);

const c2=q1.toLowerCase();
console.log(c2);

const c3=q1.charAt(3);
console.log(c3);

const c4=q1.indexOf('or',4);
console.log(c4);

const c5=q1.concat(' hello hello world');
console.log(c5);

const c6=q1.includes('ld',4);
console.log(c6);

const c7=q1.replace('llo','oool');
console.log(c7);

const c11=q1.split('o',3);
console.log(c11);

const c8=q1.substr(0,3);
console.log(c8);

const c9=q1.search('ell');
console.log(c9);

const c10=q1.trim();
console.log(c10);

// 2)
var q2='rose sunflower lilly'

const d1=q2.toUpperCase();
console.log(d1);

const d2=q2.toLowerCase();
console.log(d2);

const d3=q2.charAt(3);
console.log(d3);

const d4=q2.indexOf('ow',4);
console.log(d4);

const d5=q2.concat(' hello hello world');
console.log(d5);

const d6=q2.includes('ll',4);
console.log(d6);

const d7=q2.replace('flo','oool');
console.log(d7);

const d11=q2.split('o',3);
console.log(d11);

const d8=q2.substr(0,3);
console.log(d8);

const d9=q2.search('wer');
console.log(d9);

const d10=q2.trim();
console.log(d10);

// 3)

var q3='kgf rajkumara pailwan'
const e1=q3.toUpperCase();
console.log(e1);

const e2=q3.toLowerCase();
console.log(e2);

const e3=q3.charAt(3);
console.log(e3);

const e4=q3.indexOf('pa',4);
console.log(e4);

const e5=q3.concat(' hello hello world');
console.log(e5);

const e6=q3.includes('ra',4);
console.log(e6);

const e7=q3.replace('raj','oool');
console.log(e7);

const e11=q3.split('a',3);
console.log(e11);

const e8=q3.substr(0,3);
console.log(e8);

const e9=q3.search('uma');
console.log(e9);

const e10=q3.trim();
console.log(e10);

// 4)

var q4='suvarna zeekannada colourskannada'
const g1=q4.toUpperCase();
console.log(g1);

const g2=q4.toLowerCase();
console.log(g2);

const g3=q4.charAt(3);
console.log(g3);

const g4=q4.indexOf('ka',4);
console.log(g4);

const g5=q4.concat(' hello hello world');
console.log(g5);

const g6=q4.includes('our',4);
console.log(g6);

const g7=q4.replace('var','oool');
console.log(g7);

const g11=q4.split('a',3);
console.log(g11);

const g8=q4.substr(0,3);
console.log(g8);

const g9=q4.search('nna');
console.log(g9);

const g10=q1.trim();
console.log(g10);

// 5)
var q5='lg samsung phillips'
const i1=q5.toUpperCase();
console.log(i1);

const i2=q5.toLowerCase();
console.log(c2);

const i3=q5.charAt(3);
console.log(i3);

const i4=q5.indexOf('ll',4);
console.log(i4);

const i5=q5.concat(' hello hello world');
console.log(i5);

const i6=q5.includes('ip',4);
console.log(i6);

const i7=q5.replace('ung','oool');
console.log(i7);

const i11=q5.split('s',3);
console.log(i11);

const i8=q5.substr(0,3);
console.log(i8);

const i9=q5.search('ams');
console.log(i9);

const i10=q5.trim();
console.log(i10);

// 6)
var q6='airtel bsnl vodafone'

const j1=q6.toUpperCase();
console.log(j1);

const j2=q6.toLowerCase();
console.log(j2);

const j3=q6.charAt(3);
console.log(j3);

const j4=q6.indexOf('nl',4);
console.log(j4);

const j5=q6.concat(' hello hello world');
console.log(j5);

const j6=q6.includes('da',4);
console.log(j6);

const j7=q6.replace('afo','oool');
console.log(j7);

const j11=q6.split('o',2);
console.log(j11);

const j8=q6.substr(0,3);
console.log(j8);

const j9=q6.search('one');
console.log(j9);

const j10=q6.trim();
console.log(j10);

// 7)

var q7='windows7 windows8 windows9 windows10'
let rr1=q7.toUpperCase();
console.log(rr1);

let rr2=q7.toLowerCase();
console.log(rr2);

let rr3=q7.charAt(3);
console.log(rr3);

let rr4=q7.indexOf('s8',4);
console.log(rr4);

let rr5=q7.concat(' hello hello world');
console.log(rr5)

let rr6=q7.includes('s9',4);
console.log(rr6);

let rr7=q7.replace('ws10','oool');
console.log(rr7);

let rr11=q7.split('o',3);
console.log(rr11);

let rr8=q7.substr(0,3);
console.log(r8);

let rr9=q7.search('ind');
console.log(rr9);

let rr10=q7.trim();
console.log(rr10);

// 8)
var q8='int double short'
const l1=q8.toUpperCase();
console.log(l1);

const l2=q8.toLowerCase();
console.log(l2);

const l3=q8.charAt(3);
console.log(l3);

const l4=q8.indexOf('or',4);
console.log(l4);

const l5=q8.concat(' hello hello world');
console.log(l5);

const l6=q8.includes('rt',4);
console.log(l6);

const l7=q8.replace('int','oool');
console.log(l7);

const l11=q8.split('o',3);
console.log(l11);

const l8=q8.substr(0,3);
console.log(l8);

const l9=q8.search('oub');
console.log(l9);

const l10=q8.trim();
console.log(l10);

// 9)

var q9='class string args'
const m1=q9.toUpperCase();
console.log(m1);

const m2=q9.toLowerCase();
console.log(m2);

const m3=q9.charAt(3);
console.log(m3);

const m4=q9.indexOf('tr',4);
console.log(m4);

const m5=q9.concat(' hello hello world');
console.log(m5);

const m6=q9.includes('rg',4);
console.log(m6);

const m7=q9.replace('ass','oool');
console.log(m7);

const m11=q9.split('g',3);
console.log(m11);

const m8=q9.substr(0,3);
console.log(m8);

const m9=q9.search('ing');
console.log(m9);

const m10=q9.trim();
console.log(m10);

// 10)
var q10='facebook whatsapp instagram'
const nn1=q10.toUpperCase();
console.log(nn1);

const nn2=q10.toLowerCase();
console.log(nn2);

const nn3=q10.charAt(3);
console.log(nn3);

const nn4=q10.indexOf('oo',4);
console.log(nn4);

const nn5=q10.concat(' hello hello world');
console.log(nn5);

const nn6=q10.includes('ra',4);
console.log(nn6);

const nn7=q10.replace('ace','oool');
console.log(nn7);

const nn11=q10.split('a',3);
console.log(nn11);

const nn8=q10.substr(0,3);
console.log(nn8);

const nn9=q10.search('app');
console.log(nn9);

const nn10=q10.trim();
console.log(nn10);