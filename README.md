# AWS 초급 강의 V5 엘라스틱 빈스톡 CI/CD 배포
- EC2 2개
- ALB
- NLB
- IAM
- GithubAction
- RDS
- 엘라스틱IP

# 구현기능

- GitActions, Elastic Beanstalk 사용한 CI/CD
    - Load Balancer 적용 (NLB, ALB)
    - Auto Scaling 적용
    - VPC를 사용하여 보안 유지
- Linux 배포 스크립트 작성

# 최종 배포 환경

![image](https://github.com/ReadnThink/aws-v5/assets/103480627/ca8e519b-b72a-4205-b87e-6b5487812fb1)


# CI 과정

![image](https://github.com/ReadnThink/aws-v5/assets/103480627/bf8c4c7c-313f-41f4-a27c-e8c6011c92d1)


## CI/CD를 하는 이유

실제 서비스를 제공할때 잠시라도 서버가 다운되면 안되기 때문에 CI/CD를 사용합니다. 그 과정에서 nohub, crontab, 단순 EC2 배포의 단점을 알아보았고 최종적으로 블루 그린전략으로 배포를 해보았습니다.

## Load Balancer

트래픽은 부하분산 해주는 Load Balancer에 대해 알게되었고, NLB와 ALB를 적용함으로써 보안과 부하분산을 적용해 보았습니다. 

## Auto Scaling

트래픽이 높아지면 자동으로 서버를 띄워 장애를 막을 수 있습니다.
Blue Green 전략을 사용한 이유는 자원이 많이들지만, 롤백이 쉽기때문입니다.

## VPC

VPC를 사용하여 가상 사설 클라우드를 구축하고 외부 접근을 막아 보안을 높였습니다.
RDS의 접근은 같은 보안 그룹만 접근 허용해 같은 보안그룹의 EC2만 접근이 가능하게 하였습니다.

# 엘라스틱빈스톡 프로그래밍 엑세스 방식 키 만드는 법 변경됨
https://getinthere.notion.site/290-9ad7cd0980fb42b79153dbf24faf35a6
